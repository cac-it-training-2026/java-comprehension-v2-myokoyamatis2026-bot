package q01_basic.question05;

class Member extends AbstMember {
	//TODO ここから実装する
	int id;
	String password;
	String name;
	int age;
	int rank;

	public Member() {

	}//引数なしコンストラクタ

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}//引数ありのコンストラクタ

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getRank() {
		return rank;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public void buyItem() {
		System.out.println(name + "purchased the item at 50% off");
	}

	@Override
	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("id:" + id);
		System.out.println("password:" + password);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}
}
