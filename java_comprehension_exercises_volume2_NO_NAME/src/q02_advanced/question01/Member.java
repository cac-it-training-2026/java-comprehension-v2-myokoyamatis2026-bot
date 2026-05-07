package q02_advanced.question01;

import java.util.ArrayList;
import java.util.List;

class Member {
	//TODO ここから実装する
	int id;
	String password;
	String name;
	int age;
	int rank;
	private List<Coupon> coupons;//List複数データを入れる箱、今回はオブジェクトを複数保存できる

	public Member() {
		this.coupons = new ArrayList<>();
	}//引数なしコンストラクタ

	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = new ArrayList<>();

		Coupon c1 = new Coupon(1, 0.5, "最初の特典");
		Coupon c2 = new Coupon(2, 0.25, "今月の特典");

		coupons.add(c1);//返すってより追加する（保存してる）
		coupons.add(c2);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	@Override
	public String toString() {
		return "Member [id=" + id +
				", password=" + password +
				", name=" + name +
				", age=" + age +
				", rank=" + rank +
				", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}
}
