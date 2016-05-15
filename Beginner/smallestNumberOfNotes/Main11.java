package smallestNumberOfNotes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());

		while (n > 0) {
			String input = bf.readLine();
			int number = Integer.parseInt(input);
			int rs1 = 1;
			int rs2 = 2;
			int rs3 = 5;
			int rs4 = 10;
			int rs5 = 50;
			int rs6 = 100;

			int count = 0;

			if (number >= rs6) {
				if (number % rs6 == 0) {
					count = number / rs6;
			//		System.out.println("stotka");
					number = 0;
				} else
					while (number > 0) {
						if (number > rs6) {
							count += number / rs6;
							number = number % rs6;
				//			System.out.println("stoka");
						} else if (number > rs5) {
							count += number / rs5;
							number = number % rs5;
						} else if (number > rs4) {
							count += number / rs4;
							number = number % rs4;
						} else if (number > rs3) {
							count += number / rs3;
							number = number % rs3;
						} else if (number > rs2) {
							count += number / rs2;
							number = number % rs2;
						} else if (number > rs1) {
							count += number / rs1;
							number = number % rs1;
						}
					}
			}
			
			if (number >= rs5) {
				if (number % rs5 == 0) {
					count = number / rs5;
			//		System.out.println("pedeset");
					number = 0;
				} else while (number > 0) {
					
					if (number > rs5) {
						count += number / rs5;
						number = number % rs5;
					} else if (number > rs4) {
						count += number / rs4;
						number = number % rs4;
					} else if (number > rs3) {
						count += number / rs3;
						number = number % rs3;
					} else if (number > rs2) {
						count += number / rs2;
						number = number % rs2;
					} else if (number > rs1) {
						count += number / rs1;
						number = number % rs1;
					}
				}
			}
			
			if (number >= rs4) {
				if (number % rs4 == 0) {
					count = number / rs4;
			//		System.out.println("setka");
					number = 0;
				} else while (number > 0) {
					
					if (number > rs4) {
						count += number / rs4;
						number = number % rs4;
					} else if (number > rs3) {
						count += number / rs3;
						number = number % rs3;
					} else if (number > rs2) {
						count += number / rs2;
						number = number % rs2;
					} else if (number > rs1) {
						count += number / rs1;
						number = number % rs1;
					}
				}
			}
			
			if (number >= rs3) {
				if (number % rs3 == 0) {
					count = number / rs3;
			//		System.out.println("pet");
					number = 0;
				} else while (number > 0) {
					
					if (number > rs3) {
						count += number / rs3;
						number = number % rs3;
					} else if (number > rs2) {
						count += number / rs2;
						number = number % rs2;
					} else if (number > rs1) {
						count += number / rs1;
						number = number % rs1;
					}
				}
			}
			
			if (number >= rs2) {
				if (number % rs2 == 0) {
					count = number / rs2;
			//		System.out.println("dva");
					number = 0;
				} else while (number > 0) {
					
					if (number >= rs2) {
						count += number / rs2;
						number = number % rs2;
					} else if (number >= rs1) {
						count += number / rs1;
						number = number % rs1;
					}
					
				}
			}
			
			if (number >= rs1) {
			//	System.out.println("aaaaa");
				if (number % rs1 == 0) {
					count = number / rs1;
				//	System.out.println("kec");
					number = 0;
				} else while (number > 0) {	
					if (number > rs1) {
						count += number / rs1;
						number = number % rs1;
					}
				}
			}
			
			System.out.println(count);
			n--;
		}
	}
}
