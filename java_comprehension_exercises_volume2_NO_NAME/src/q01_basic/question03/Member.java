package q01_basic.question03;

class Member {
	//TODO ここから実装する
	String name;
	int age;
	int rank;

	public Member() {

	}

	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	String getName() {
		return name;
	}

	int getAge() {
		return age;
	}

	int getRank() {
		return rank;
	}

	void setName(String name) {
		this.name = name;
	}

	void setAge(int age) {
		this.age = age;
	}

	void setRank(int rank) {
		this.rank = rank;
	}

	void rankUp() {
		rank++;
	}

	void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
		System.out.println("*****************");
	}
}
