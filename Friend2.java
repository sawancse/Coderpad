import java.util.Collection;
import java.util.ArrayList;

public class Friend2 {
    private Collection<Friend2> friends;
    private String email;

    public Friend2(String email) {
        this.email = email;
        this.friends = new ArrayList<Friend2>();
    }

    public String getEmail() {
        return email;
    }

    public Collection<Friend2> getFriends() {
        return friends;
    }

    public void addFriendship(Friend2 friend) {
        friends.add(friend);
        friend.getFriends().add(this);
    }

    public boolean canBeConnected(Friend2 friend) {
    	if(friend==null) {
        throw new UnsupportedOperationException("Waiting to be implemented.");}
    	
    	for(Friend2 f: friend.getFriends()) {
    		if(f.getEmail()!=f.getEmail()) {
    			
    			return false;
    		}
    		
    	}

    	return true;
    }

    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Friend2 other = (Friend2) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}

	public static void main(String[] args) {
        Friend2 a = new Friend2("A");
        Friend2 b = new Friend2("B");
        Friend2 c = new Friend2("C");

        a.addFriendship(b);
        b.addFriendship(c);

        System.out.println(a.canBeConnected(c));
    }
}