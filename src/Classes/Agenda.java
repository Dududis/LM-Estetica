package Classes;

import java.util.Scanner;

public class Agenda {

	@SuppressWarnings ( " recurso " )
	 Agenda publica () {
		
		Scanner input =  new Scanner(System.in);

		System.out.println("Esta � uma agenda, voc� pode marcar os hor�rios aqui ");
		System.out.println("Para isso basta selecionar o dia e o hor�rio disponivel para agendar um procedimento");
		System.out.println(" ");
		
		String[] semana = new String [10];
		
		semana[0] = "Segunda de manh�";
		semana[1] = "Segunda de tarde";
		semana[2] = "Ter�a de manh�";
		semana[3] = "Ter�a de tarde";
		semana[4] = "Quarta de manh�";
		semana[5] = "Quarta de tarde";
		semana[6] = "Quinta de manh�";
		semana[7] = "Quita de tarde";
		semana[8] = "Sexta de manh�";
		semana[9] = "Sexta de tarde";
		
		System.out.println("Selecione o n�mero corresponde ao dia em queira marcar ");
		System.out.println("		Sistema . para fora . println ( \" (0) Segunda de manh� \\ n (1) Segunda de tarde \\ n (2) Ter�a de manh� \\ n (3) Ter�a de tarde \\ n ((4) Quarta de manh� \\ n (6) Quarta de tarde \\ n (6) Quinta de manh� \\ n (7) Quinta de tarde \\ n (8) Sexta de manh� \\ n (9) Sexta de tarde \\ n \" );\r\n"
				+ "");
		int i = input.nextInt();
		
		if (i ==  0 ) {
			System.out.printf(" O atendimento foi marcado para% s. \ n " , semana [i]);
		}
		if (i ==  1) {
			System.out.printf(" O atendimento foi marcado para% s. \ n " , semana [i]);
		}
		if (i ==  2) {
			System.out.printf(" O atendimento foi marcado para% s. \ n " , semana [i]);
		}
		if (i ==  3) {
			System.out.printf(" O atendimento foi marcado para% s. \ n " , semana [i]);
		}
		if (i ==  4) {
			System.out.printf(" O atendimento foi marcado para% s. \ n " , semana [i]);
		}
		if (i ==  5) {
			System.out.printf(" O atendimento foi marcado para% s. \ n " , semana [i]);
		}
		if (i ==  6) {
			System.out.printf(" O atendimento foi marcado para% s. \ n " , semana [i]);
		}
		if (i ==  7) {
			System.out.printf(" O atendimento foi marcado para% s. \ n " , semana [i]);
		}
		if (i == 8) {
			System.out.printf(" O atendimento foi marcado para% s. \\ n ", semana [i]);
		}
		if (i == 9) {
			System.out.printf(" O atendimento foi marcado para% s. \\ n ", semana [i]);
		}

	}
} //fim
