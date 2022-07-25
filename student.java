package StudentManagementSystem;

public class student 
{
	private int StdId;
	private String Name;
	private String address;
	
	public student(int StdId, String Name, String address)
	{
		super();
		this.StdId=StdId;
		this.Name=Name;
		this.address=address;
	}

	public int getStdId() {
		return StdId;
	}

	public void setStdId(int stdId) {
		StdId = stdId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "student [StdId=" + StdId + ", Name=" + Name + ", address=" + address + "]";
	}
	
	
}
