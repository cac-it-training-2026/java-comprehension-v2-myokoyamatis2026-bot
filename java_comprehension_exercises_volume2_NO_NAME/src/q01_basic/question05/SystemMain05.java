package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {

		AbstMember[] members = new AbstMember[2];

		members[0] = new NonMember("Sato kensuke");
		members[1] = new Member(1, "Password", "Miura Manabu", 28, 2);

		System.out.println("---SHOW MEMBERS---");
		MemberManager.showAllMembers(members);

		System.out.println("---BUY ITEM---");
		for (AbstMember member : members) {
			member.buyItem();
		}
	}
}
