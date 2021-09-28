package Classes;

import java.util.Scanner;

public class Agenda {

	@SuppressWarnings ( " recurso " )
	 Agenda publica () {
		
		Scanner input =  new Scanner(System.in);

		System.out.println("Esta é uma agenda, você pode marcar os horários aqui ");
		System.out.println("Para isso basta selecionar o dia e o horário disponivel para agendar um procedimento");
		System.out.println(" ");
		
		String[] semana = new String [10];
		
		semana[0] = "Segunda de manhã";
		semana[1] = "Segunda de tarde";
		semana[2] = "Terça de manhã";
		semana[3] = "Terça de tarde";
		semana[4] = "Quarta de manhã";
		semana[5] = "Quarta de tarde";
		semana[6] = "Quinta de manhã";
		semana[7] = "Quita de tarde";
		semana[8] = "Sexta de manhã";
		semana[9] = "Sexta de tarde";
		
		System.out.println("Selecione o número corresponde ao dia em queira marcar ");
		System.out.println("		Sistema . para fora . println ( \" (0) Segunda de manhã \\ n (1) Segunda de tarde \\ n (2) Terça de manhã \\ n (3) Terça de tarde \\ n ((4) Quarta de manhã \\ n (6) Quarta de tarde \\ n (6) Quinta de manhã \\ n (7) Quinta de tarde \\ n (8) Sexta de manhã \\ n (9) Sexta de tarde \\ n \" );\r\n"
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
