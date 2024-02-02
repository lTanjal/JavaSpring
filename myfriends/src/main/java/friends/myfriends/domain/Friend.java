package friends.myfriends.domain;

public class Friend {
    private long id;
    private String friendName; 
	

    public Friend() {
		super();
		
	}
	
	
	public Friend(String friendName) {
		super();
		this.friendName = friendName;
	}


	public Friend(long id, String friendName) {
		super();
		this.id = id;
		this.friendName = friendName;
	}


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getFriendName() {
        return friendName;
    }


    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }
    @Override
	public String toString() {
		return friendName;
	}

}
	