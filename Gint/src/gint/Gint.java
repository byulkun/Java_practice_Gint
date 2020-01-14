package gint;

import java.util.ArrayList;
import java.util.Scanner;

public class Gint {
	private static Member[] memberArray = new Member[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int arrayNum = 0;

	public static void main(String[] arg) {
		System.out.println("직원 및 팀 목록을 불러오는 중입니다. 잠깐만 기다려주세요.");
		setMember();
		boolean routine = true;

		while (routine) {
			System.out.println("-----------------------------------------");
			System.out.println("1.직원 열람 | 2.팀 열람 | 3.종료");
			System.out.println("-----------------------------------------");
			System.out.print("선택> ");

			/*int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				watchMember();
			} else if (selectNo == 2) {
				watchTeamlist();
			} else if (selectNo == 3) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("알맞은 번호를 입력하시오");
			}*/

			switch(scanner.nextInt()){
				case 1:
					watchMember();
					break;
				case 2:
					watchTeamlist();
					break;
				case 3:
					System.out.println("종료");
					routine = false;
					break;
				default:
					System.out.println("알맞은 번호를 입력하시오");
					break;
			}

		}
	}

	private static void setMember() {
		memberArray[arrayNum] = new Member("김용현", "임원", "대표이사");
		arrayNum++;
		memberArray[arrayNum] = new Member("손승락", "임원", "연구소장");
		arrayNum++;
		memberArray[arrayNum] = new Member("송재호", "임원", "서비스 프랫폼 개발팀 팀장");
		arrayNum++;
		memberArray[arrayNum] = new Member("손승락", "데이터 연구팀", "(겸)팀장(이사)");
		arrayNum++;
		memberArray[arrayNum] = new Member("김지은", "경영 지원팀", "팀장(차장)");
		arrayNum++;
		memberArray[arrayNum] = new Member("박성은", "경영 지원팀", "주임");
		arrayNum++;
		memberArray[arrayNum] = new Member("김명중", "경영 지원팀", "주임");
		arrayNum++;
		memberArray[arrayNum] = new Member("김연태", "자율 주행 플랫폼팀", "팀장(책임)");
		arrayNum++;
		memberArray[arrayNum] = new Member("최성훈", "자율 주행 플랫폼팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("최상천", "제어 시스템 개발팀", "팀장(책임)");
		arrayNum++;
		memberArray[arrayNum] = new Member("이근식", "제어 시스템 개발팀", "책임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("윤희범", "제어 시스템 개발팀", "선임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("김도훈", "제어 시스템 개발팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("김민지", "제어 시스템 개발팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("김은태", "제어 시스템 개발팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("이동환", "제어 시스템 개발팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("김도훈", "제어 시스템 개발팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("윤해온", "H/W 플랫폼팀", "팀장(책임)");
		arrayNum++;
		memberArray[arrayNum] = new Member("손민규", "H/W 플랫폼팀", "선임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("한아름", "H/W 플랫폼팀", "선임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("신현모", "임베디드 S/W팀", "팀장(책임)");
		arrayNum++;
		memberArray[arrayNum] = new Member("장여운", "임베디드 S/W팀", "책임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("김병선", "임베디드 S/W팀", "선임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("장수환", "임베디드 S/W팀", "선임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("송재호", "서비스 프랫폼 개발팀", "팀장(이사)");
		arrayNum++;
		memberArray[arrayNum] = new Member("김현길", "서비스 프랫폼 개발팀", "책임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("김진원", "서비스 프랫폼 개발팀", "선임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("도상희", "서비스 프랫폼 개발팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("안영범", "서비스 프랫폼 개발팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("이한별", "서비스 프랫폼 개발팀", "주임연구원");
		arrayNum++;
		memberArray[arrayNum] = new Member("이혜진", "서비스 프랫폼 개발팀", "주임연구원");
		arrayNum++;
	}

	private static void watchMember() {
		System.out.println("원하는 멤버의 이름을 입력해주세요");
		System.out.print("이름 : ");
		String member = scanner.next();
		int checkCnt = 0;

		for (int i = 0; i < arrayNum; i++) {
			if (memberArray[i].getName().equals(member)) {
				checkCnt++;
				System.out.println(
						memberArray[i].getName() + "\t" + memberArray[i].getTeam() + "\t" + memberArray[i].getRank());
			}

		}

		if (checkCnt == 0) {
			System.out.println("요청하신 멤버를 찾을 수 없습니다. 이름을 확인 해주세요");
		}
	}

	private static void watchTeamlist() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("1.임원 | 2.경영 지원팀 | 3.데이터 연구팀 | 4.자율 주행 플랫폼팀 | 5.제어 시스템 개발팀");
		System.out.println("6.H/W 플랫폼팀 | 7.임베디드 S/W팀 | 8.서비스 플랫폼 개발팀");
		System.out.println("------------------------------------------------------------------");
		System.out.println("원하는 팀을 선택해 주세요");
		System.out.print("> ");

		String team = "";
		/*int selectNo = scanner.nextInt();
		if (selectNo == 1) {
			team = "임원";
		} else if (selectNo == 2) {
			team = "경영 지원팀";
		} else if (selectNo == 3) {
			team = "데이터 연구팀";
		} else if (selectNo == 4) {
			team = "자율 주행 플랫폼팀";
		} else if (selectNo == 5) {
			team = "제어 시스템 개발팀";
		} else if (selectNo == 6) {
			team = "H/W 플랫폼팀";
		} else if (selectNo == 7) {
			team = "임베디드 S/W팀";
		} else if (selectNo == 8) {
			team = "서비스 프랫폼 개발팀";
		} else {
			System.out.println("알맞은 번호를 입력하시오");
		}*/

		switch (scanner.nextInt()){
			case 1:
				team = "임원";
				break;
			case 2:
				team = "경영 지원팀";
				break;
			case 3:
				team = "데이터 연구팀";
				break;
			case 4:
				team = "자율 주행 플랫폼팀";
				break;
			case 5:
				team = "제어 시스템 개발팀";
				break;
			case 6:
				team = "H/W 플랫폼팀";
				break;
			case 7:
				team = "임베디드 S/W팀";
				break;
			case 8:
				team = "서비스 프랫폼 개발팀";
				break;
			default:
				System.out.println("알맞은 번호를 입력하시오");
				break;
		}

		for (int i = 0; i < arrayNum; i++) {
			Member member = memberArray[i];
			if (member.getTeam().equals(team)) {
				System.out.println(
						member.getName() + "\t" + member.getTeam() + "\t" + member.getRank());
			}

		}
	}
}
