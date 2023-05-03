package farmacie;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class TestFarmacie {

	public static void main(String[] args) throws IOException {
		Scanner fisier = new Scanner(new File("C:\\Users\\darab\\eclipse-workspace\\farmacie\\src\\farmacie\\in.txt"));
		ArrayList<ProduseFarmacie> produse_farmacie = new ArrayList<>();

		while (fisier.hasNextLine()) {
			String info = fisier.nextLine();
			if (info != null) {
				String[] informatii = info.split("\\*");
				String id = informatii[0];
				String tipMedicament = informatii[1];
				String nume = informatii[2];
				String descriere = informatii[3];
				String producator = informatii[4];
				String valabilitate = informatii[5];
				ProduseFarmacie a = new ProduseFarmacie(id, tipMedicament, nume, descriere, producator, valabilitate);
				produse_farmacie.add(a);
			}
		}

		Scanner fisier2 = new Scanner(new File("C:\\Users\\darab\\eclipse-workspace\\farmacie\\src\\farmacie\\produse.txt"));
		ArrayList<String> tipurimedicamente = new ArrayList<>();
		while (fisier2.hasNextLine()) {
			String info2 = fisier2.nextLine();
			if (info2 != null) {
				String[] informatii2 = info2.split(" ");
				for (int i = 0; i < informatii2.length; i++)
					tipurimedicamente.add(informatii2[i]);
			}
		}

		// for (int i = 0; i < tipurimedicamente.size(); i++)
		// System.out.println(tipurimedicamente.get(i));

		ArrayList<ProduseFarmacie> medicament = new ArrayList<>();
		ArrayList<ProduseFarmacie> dieta = new ArrayList<>();
		ArrayList<ProduseFarmacie> disp = new ArrayList<>();

		for (int i = 0; i < produse_farmacie.size(); i++) {
			if (tipurimedicamente.contains(produse_farmacie.get(i).getTipMedicament())) {
				if (produse_farmacie.get(i).getTipMedicament().equals("medicament")) {
					medicament.add(produse_farmacie.get(i));
				} else if (produse_farmacie.get(i).getTipMedicament().equals("dieta")) {
					dieta.add(produse_farmacie.get(i));
				} else if (produse_farmacie.get(i).getTipMedicament().equals("dispozitiveMedicale")) {
					disp.add(produse_farmacie.get(i));
				}
			}
		}
		Farmacie catena = new Farmacie(produse_farmacie, medicament, dieta, disp);
		Collections.sort(produse_farmacie, new ComparatorProduse());
		catena.afisare();
		System.out.println("\nProdusele sortate dupa ID sunt: ");
		for (int i = 0; i < produse_farmacie.size(); i++)
			System.out.println(produse_farmacie.get(i));
		catena.dispUnice();

		fisier.close();
		fisier2.close();

	}

}
