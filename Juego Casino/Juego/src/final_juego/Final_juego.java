package final_juego;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

class Final_juego {
	static int ap, tot, tot1;

	public static void main(String[] args) {
		int res1;
		String res;

		JOptionPane.showMessageDialog(null, "Bienvenidos al Casino !!", "Casino", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Final_juego.class.getResource("/img/casino.gif")));
		do {
			res1 = Integer
					.parseInt((String) JOptionPane.showInputDialog(null,
							"Elija su juego " + "\n1-Dados" + "\n2-Envido" + "\n3-Tiro" + "\n4-Blackjack"
									+ "\n5-Adivinador",
							"Casino", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/elegir.gif")), null, null));
			ap = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Ingrese su apuesta", "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/dinero.gif")), null,
					null));
			switch (res1) {
			case 1:
				dados();
				break;
			case 2:
				envido();
				break;
			case 3:
				tiro();
				break;
			case 4:
				blackjack();
				break;
			case 5:
				adivinador();
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error al ingresar ", null, JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Final_juego.class.getResource("/img/error.gif")));
				break;
			}

			res = JOptionPane.showInputDialog("Quiere volver a jugar Si/No");
		} while (res.equalsIgnoreCase("si"));
		JOptionPane.showMessageDialog(null, "Gracias por jugar !!", "Casino", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Final_juego.class.getResource("/img/casino.gif")));
	}

	public static void dados() {
		int n1, n2;
		JOptionPane.showMessageDialog(null,
				"Bienvenido al Juego de dados \nTirar 2 dados , si la suma es 4, 7 u 11 gana", "Casino",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/juegodados.gif")));
		n1 = (int) (Math.random() * 6 + 1);
		n2 = (int) (Math.random() * 6 + 1);
		JOptionPane.showMessageDialog(null, "Primer dado " + n1, "Casino", JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(Final_juego.class.getResource("/img/dado" + n1 + ".png")));
		JOptionPane.showMessageDialog(null, "Segundo dado " + n2, "Casino", JOptionPane.PLAIN_MESSAGE,
				new ImageIcon(Final_juego.class.getResource("/img/dado" + n2 + ".png")));
		tot = n1 + n2;
		if (tot == 4 || tot == 7 || tot == 11) {
			tot1 = ap * 2;
			JOptionPane.showMessageDialog(null, "Gano el Juego, Duplica la apuesta" + " $" + tot1, "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/ganar.gif")));
		} else {
			JOptionPane.showMessageDialog(null, "Perdio el Juego, Pierde la apuesta", "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/perder.gif")));
		}
	}

	public static void envido() {
		int car, c1 = 0, p1, c2 = 0, p2, c3 = 0, p3;
		JOptionPane.showMessageDialog(null,
				"Bienvenido al Mini Envido \nConsiste en extraer 3 cartas, si 2 son del mismo numero, gana", "Casino",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/juegocartas.gif")));
		for (int i = 0; i <= 2; i++) {
			car = Integer.parseInt((String) JOptionPane.showInputDialog(null,
					"Eliga la carta \n1.Izquierda \n2.Medio \n3.Derecha", "Casino", JOptionPane.DEFAULT_OPTION,
					new ImageIcon(Final_juego.class.getResource("/img/juegodecartas.png")), null, null));

			switch (car) {
			case 1:
				c1 = (int) (Math.random() * 12 + 1);
				p1 = c1;
				JOptionPane.showMessageDialog(null, "Su carta es " + p1, "Casino", JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(Final_juego.class.getResource("/img/carta" + p1 + ".png")));
				break;
			case 2:
				c2 = (int) (Math.random() * 12 + 1);
				p2 = c2;
				JOptionPane.showMessageDialog(null, "Su carta es " + p2, "Casino", JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(Final_juego.class.getResource("/img/carta" + p2 + ".png")));
				break;
			case 3:
				c3 = (int) (Math.random() * 12 + 1);
				p3 = c3;
				JOptionPane.showMessageDialog(null, "Su carta es " + p3, "Casino", JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(Final_juego.class.getResource("/img/carta" + p3 + ".png")));
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error al ingresar ", null, JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Final_juego.class.getResource("/img/error.gif")));
				break;
			}
		}
		if (c1 == c2 || c2 == c3 || c3 == c1) {
			tot1 = ap * 2;
			JOptionPane.showMessageDialog(null, "Gano el Juego, Duplica la apuesta" + " $" + tot1, "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/ganar.gif")));
		} else {
			JOptionPane.showMessageDialog(null, "Pierda el Juego, Pierde la apuesta", "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/perder.gif")));
		}

	}

	public static void tiro() {
		int pat;

		JOptionPane.showMessageDialog(null,
				"Bienvenido a Tiro al Ave \nHay 6 Aves (tres Aves con puntaje 0,\r\n" + "dos con 5 puntos, otro con 10)"
						+ "\nTiene 5 disparos , si tiene igual mas de 25 puntos gana",
				"Casino", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Final_juego.class.getResource("/img/juegopatos.gif")));
		for (int i = 0; i <= 4; i++) {
			pat = Integer.parseInt(
					(String) JOptionPane.showInputDialog(null, "Eliga el ave 1-6", "Casino", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/juegodepatos.png")), null, null));
			pat = (int) (Math.random() * 6 + 1);
			switch (pat) {
			case 1:
			case 2:
			case 3:
				JOptionPane.showMessageDialog(null, "Sumaste 0 puntos", "Casino", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Final_juego.class.getResource("/img/ave0.png")));
				tot = tot + 0;
				break;
			case 4:
			case 5:
				JOptionPane.showMessageDialog(null, "Sumaste 5 puntos", "Casino", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Final_juego.class.getResource("/img/ave5.png")));
				tot = tot + 5;
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Sumaste 10 puntos", "Casino", JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Final_juego.class.getResource("/img/ave10.png")));
				tot = tot + 10;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error al ingresar ", null, JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Final_juego.class.getResource("/img/error.gif")));
				break;
			}
		}
		if (tot >= 25) {
			tot1 = ap * 2;
			JOptionPane.showMessageDialog(null, "Gano el juego, Duplica la apuesta" + " $" + tot1, "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/ganar.gif")));
		} else {
			JOptionPane.showMessageDialog(null, "Perdio el juego, Pierde la apuesta", "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/perder.gif")));
		}
	}

	public static void blackjack() {
		int m1, m2, dl = 0, jg = 0;
		String les;
		int[] dealer = new int[2];
		int[] jugador = new int[2];

		JOptionPane.showMessageDialog(null, "Bienvenido al BlackJack"
				+ "\nFinal_juego obtenga el mayor puntaje siempre y cuando sea menor o igual a 21 gana"
				+ "\nLa mesa solo puede plantarse si supera al jugador en puntaje, caso contrario pedira otra carta",
				"Casino", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Final_juego.class.getResource("/img/blackjack.gif")));

		for (int i = 0; i < dealer.length; i++) {
			dealer[i] = (int) (Math.random() * 11 + 1);
			JOptionPane.showMessageDialog(null, "Le toco al dealer un " + dealer[i], "Casino",
					JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(Final_juego.class.getResource("/img/carta" + dealer[i] + ".png")));
			dl = dl + dealer[i];
		}
		JOptionPane.showMessageDialog(null, "El dealer tiene en mano " + dl, "Casino", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Final_juego.class.getResource("/img/mano.gif")));

		for (int i = 0; i < jugador.length; i++) {
			jugador[i] = (int) (Math.random() * 11 + 1);
			JOptionPane.showMessageDialog(null, "Le toco al jugador un " + jugador[i], "Casino",
					JOptionPane.PLAIN_MESSAGE,
					new ImageIcon(Final_juego.class.getResource("/img/carta" + jugador[i] + ".png")));
			jg = jg + jugador[i];
		}
		JOptionPane.showMessageDialog(null, "El Jugador tiene en mano " + jg, "Casino", JOptionPane.DEFAULT_OPTION,
				new ImageIcon(Final_juego.class.getResource("/img/mano.gif")));

		if (dl == 21) {
			JOptionPane.showMessageDialog(null, "Perdio el juego, Pierde la apuesta", "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/perder.gif")));
		} else if (dl > 21) {
			tot1 = ap * 2;
			JOptionPane.showMessageDialog(null, "Gano el juego, Duplica la apuesta" + " $" + tot1, "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/ganar.gif")));
		} else if (jg == 21) {
			tot1 = ap * 2;
			JOptionPane.showMessageDialog(null, "Gano el juego, Duplica la apuesta" + " $" + tot1, "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/ganar.gif")));
		}

		JOptionPane.showMessageDialog(null, "\nEl dealer tiene " + dl + "\nEl jugador tiene " + jg, "Casino",
				JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/blackjack.gif")));
		if (jg > 21) {
			JOptionPane.showMessageDialog(null, "Perdio el juego, Pierde la apuesta", "Casino",
					JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/perder.gif")));
		} else if (jg < 21) {
			les = JOptionPane.showInputDialog("Quiere otra carta ?");
			while (les.equalsIgnoreCase("si") && jg < 21) {
				m1 = (int) (Math.random() * 11 + 1);
				jg = jg + m1;
				JOptionPane.showMessageDialog(null, "Al jugador le toco " + m1, "Casino", JOptionPane.PLAIN_MESSAGE,
						new ImageIcon(Final_juego.class.getResource("/img/carta" + m1 + ".png")));
				JOptionPane.showMessageDialog(null, "El jugador tiene en mano " + jg, "Casino",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/mano.gif")));
				if (jg < 21) {
					les = (String) JOptionPane.showInputDialog(null, "Quiere otra carta ?", "Casino",
							JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/blackjack.gif")), null, null);
				}
			}
			if (jg > 21) {
				JOptionPane.showMessageDialog(null, "Perdio el juego, Pierde la apuesta", "Casino",
						JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/perder.gif")));
			} else if (dl < jg) {
				while (dl < jg && dl < 21) {
					m2 = (int) (Math.random() * 11 + 1);
					dl = dl + m2;
					JOptionPane.showMessageDialog(null, "Al Dealer le toco " + m2, "Casino", JOptionPane.PLAIN_MESSAGE,
							new ImageIcon(Final_juego.class.getResource("/img/carta" + m2 + ".png")));
					JOptionPane.showMessageDialog(null, "El Dealer tiene en mano " + dl, "Casino",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/mano.gif")));
				}
				if (dl > 21) {
					tot1 = ap * 2;
					JOptionPane.showMessageDialog(null, "Gano el juego, Duplica la apuesta" + " $" + tot1, "Casino",
							JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/ganar.gif")));
				} else if (dl == jg) {
					JOptionPane.showMessageDialog(null, "Se empato el juego, Se queda con su apuesta " + " $" + ap,
							"Casino", JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/empate.gif")));
				} else {
					JOptionPane.showMessageDialog(null, "Perdio el juego, Pierde la apuesta", "Casino",
							JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/perder.gif")));
				}
			}
		}
	}

	public static void adivinador() {
		int r;
		String res, ay1, ay2;

		JOptionPane.showMessageDialog(null,
				"Bienvenidos al Adivinador (quien es quien)"
						+ "\nLa maquina elegira un personaje Random , y el jugador debera adivinar de quien se trata"
						+ "\nEn el comienzo la casa te da 3 pistas iniciales y la posibilidad de pedir 2 pistas mas"
						+ "\nPara pedirlas solo debe escribir ayuda y estas apareceran"
						+ "\nSi adivina el personaje sin pedir pistas multiplica x4 su apuesta"
						+ "\nSi lo adivina pidiendo 1 multiplica x3 su apuesta"
						+ "\nSi lo adivina pidiendo todas las pistas gana un multiplica x2 su apuesta",
				"casino", JOptionPane.DEFAULT_OPTION, new ImageIcon(Final_juego.class.getResource("/img/casino.gif")));

		String[] personajes = { "Black Panther", "Punisher", "Spiderman", "Ironman", "Loki", "Thor" };

		String[] preguntas = { "Usa mascara?", "Vive en algun escondite?", "su traje aumenta su fuerza?",
				"Utiliza algun arma (Martillo/Espadas)?", "Es un dios ?" };

		String[][] respuestas = { { "si", "si", "si", "no", "no" }, { "no", "si", "no", "si", "no" },
				{ "si", "no", "si", "si", "no" }, { "si", "si", "si", "si", "no" }, { "no", "no", "no", "si", "si" },
				{ "no", "no", "si", "si", "si" } };

		r = (int) (Math.random() * personajes.length);
		System.out.println("Numero: " + r);

		res = (String) JOptionPane.showInputDialog(null,
				" Adivina el Personaje " + "\nPistas " + "\n" + preguntas[0] + "  " + respuestas[r][0] + "\n"
						+ preguntas[1] + "  " + respuestas[r][1] + "\n" + preguntas[2] + "  " + respuestas[r][2]
						+ "\nAyudas Restantes: 2" + "\nSe puede arriesgar por un personaje o pedir ayudar",
				"Casino", JOptionPane.WARNING_MESSAGE,
				new ImageIcon(Final_juego.class.getResource("/img/personajes.jpg")), null, null);

		if (res.equalsIgnoreCase("ayuda")) {
			ay1 = (String) JOptionPane.showInputDialog(null,
					" Adivina el Personaje " + "\nPistas: " + "\n" + preguntas[0] + "  " + respuestas[r][0] + "\n"
							+ preguntas[1] + "  " + respuestas[r][1] + "\n" + preguntas[2] + "  " + respuestas[r][2]
							+ "\n" + preguntas[3] + "  " + respuestas[r][3] + "\nAyudas Restantes: 1"
							+ "\nSe puede arriesgar por un personaje o pedir ayudar",
					"Casino", JOptionPane.WARNING_MESSAGE,
					new ImageIcon(Final_juego.class.getResource("/img/personajes.jpg")), null, null);
			if (ay1.equalsIgnoreCase("ayuda")) {
				ay2 = (String) JOptionPane.showInputDialog(null,
						" Adivina el Personaje " + "\nPistas: " + "\n" + preguntas[0] + "  " + respuestas[r][0] + "\n"
								+ preguntas[1] + "  " + respuestas[r][1] + "\n" + preguntas[2] + "  " + respuestas[r][2]
								+ "\n" + preguntas[3] + "  " + respuestas[r][3] + "\n" + preguntas[4] + "  "
								+ respuestas[r][4] + "\nAyudas Restantes: 0" + "\nSe debe arriesgar por un personaje",
						"Casino", JOptionPane.WARNING_MESSAGE,
						new ImageIcon(Final_juego.class.getResource("/img/personajes.jpg")), null, null);
				if (ay2.equalsIgnoreCase(personajes[r])) {
					tot1 = ap * 2;
					JOptionPane.showMessageDialog(null, "Gano el juego, Duplica la apuesta" + " $" + tot1, "Casino",
							JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/personaje" + r + ".jpg")));
				} else {
					JOptionPane.showMessageDialog(null,
							"Perdio el juego, Pierde la apuesta, " + "El personaje era " + personajes[r], "Casino",
							JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/personaje" + r + ".jpg")));
				}
			} else {
				if (ay1.equalsIgnoreCase(personajes[r])) {
					tot1 = ap * 3;
					JOptionPane.showMessageDialog(null, "Gano el juego, Triplica la apuesta" + " $" + tot1, "Casino",
							JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/personaje" + r + ".jpg")));
				} else {
					JOptionPane.showMessageDialog(null,
							"Perdio el juego, Pierde la apuestam, " + "El personaje era " + personajes[r], "Casino",
							JOptionPane.DEFAULT_OPTION,
							new ImageIcon(Final_juego.class.getResource("/img/personaje" + r + ".jpg")));
				}
			}
		} else {
			if (res.equalsIgnoreCase(personajes[r])) {
				tot1 = ap * 4;
				JOptionPane.showMessageDialog(null, "Gano el juego, Cuadripila la apuesta" + " $" + tot1, "Casino",
						JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Final_juego.class.getResource("/img/personaje" + r + ".jpg")));

			} else {
				JOptionPane.showMessageDialog(null,
						"Perdio el juego, Pierde la apuesta, " + "El personaje era " + personajes[r], "Casino",
						JOptionPane.DEFAULT_OPTION,
						new ImageIcon(Final_juego.class.getResource("/img/personaje" + r + ".jpg")));

			}

		}

	}

}
