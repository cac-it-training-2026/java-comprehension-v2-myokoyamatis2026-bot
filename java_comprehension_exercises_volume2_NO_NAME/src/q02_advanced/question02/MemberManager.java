package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {

		for (Member member : members) {
			member.showMember();
		}
	}

	//パスワードを変更する役割
	public static void updatePassword(
			List<Member> members,
			int targetId,
			String newPassword) {

		boolean isExist = false;

		for (Member member : members) {

			if (member.getId() == targetId) {

				member.setPassword(newPassword);

				isExist = true;
			}
		}

		if (!isExist) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
