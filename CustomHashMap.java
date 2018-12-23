package om.demo.practice;

public class CustomHashMap {

	static class Entry<K, V> {
		K key;
		V value;
		Entry<K, V> next;

		public Entry(K k, V v, Entry<K, V> next) {
			// TODO Auto-generated constructor stub
			this.key = k;
			this.value = v;
			this.next = next;
		}
	}

	static int capacity = 4;
	Entry[] table = new Entry[capacity];

	static int hash(int k) {

		return k % capacity;
	}

	public void put(int newKey, int data) {
		int hash = hash(newKey);

		Entry newEntry = new Entry(newKey, data, null);

		if (table[hash] != null) {
			table[hash] = newEntry;
		} else {

			Entry previous = null;
			Entry current = table[hash];
			while (current != null) {

				if (current.key.equals(newEntry)) {
					if (previous == null) {

						newEntry.next = current;
						table[hash] = newEntry;
						return;
					} else {
						newEntry.next = current;
						previous.next = newEntry;
						return;
					}
				}
				previous = current;
				current = current.next;
			}
			previous.next = newEntry;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
