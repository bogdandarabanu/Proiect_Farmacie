package farmacie;

import java.util.ArrayList;

public class Farmacie {

	private ArrayList<ProduseFarmacie> produse = new ArrayList<>();
	private ArrayList<ProduseFarmacie> medicamente = new ArrayList<>();
	private ArrayList<ProduseFarmacie> diete = new ArrayList<>();
	private ArrayList<ProduseFarmacie> dispozitiveMedicale = new ArrayList<>();

	public Farmacie(ArrayList<ProduseFarmacie> produse, ArrayList<ProduseFarmacie> medicamente,
			ArrayList<ProduseFarmacie> diete, ArrayList<ProduseFarmacie> dispozitiveMedicale) {
		super();
		this.produse = produse;
		this.medicamente = medicamente;
		this.diete = diete;
		this.dispozitiveMedicale = dispozitiveMedicale;
	}

	public ArrayList<ProduseFarmacie> getProduse() {
		return produse;
	}

	public void setProduse(ArrayList<ProduseFarmacie> produse) {
		this.produse = produse;
	}

	public ArrayList<ProduseFarmacie> getMedicamente() {
		return medicamente;
	}

	public void setMedicamente(ArrayList<ProduseFarmacie> medicamente) {
		this.medicamente = medicamente;
	}

	public ArrayList<ProduseFarmacie> getDiete() {
		return diete;
	}

	public void setDiete(ArrayList<ProduseFarmacie> diete) {
		this.diete = diete;
	}

	public ArrayList<ProduseFarmacie> getDispozitiveMedicale() {
		return dispozitiveMedicale;
	}

	public void setDispozitiveMedicale(ArrayList<ProduseFarmacie> dispozitiveMedicale) {
		this.dispozitiveMedicale = dispozitiveMedicale;
	}

	@Override
	public String toString() {
		return "Farmacie [produse=" + produse + ", medicamente=" + medicamente + ", diete=" + diete
				+ ", dispozitiveMedicale=" + dispozitiveMedicale + "]";
	}

	public void afisare() {
		System.out.println("\nToate produsele din farmacie sunt:");
		for (int i = 0; i < produse.size(); i++)
			System.out.println(produse.get(i));
		System.out.println("\nMedicamentele din farmacie sunt:");
		for (int i = 0; i < medicamente.size(); i++)
			System.out.println(medicamente.get(i));
		System.out.println("\nProdusele de tip 'dieta' din farmacie sunt:");
		for (int i = 0; i < diete.size(); i++)
			System.out.println(diete.get(i));
		System.out.println("\nDispozitivele medicale din farmacie sunt:");
		for (int i = 0; i < dispozitiveMedicale.size(); i++)
			System.out.println(dispozitiveMedicale.get(i));
	}

	public void dispUnice() {
		ArrayList<ProduseFarmacie> unice = new ArrayList<>();
		boolean adauga = false;
		for (int i = 0; i < produse.size() - 1; i++)
			if (produse.get(i).getId().compareTo(produse.get(i + 1).getId()) != 0) {
				if (produse.get(i).getTipMedicament().equals("dispozitiveMedicale"))
					unice.add(produse.get(i));
				adauga = false;
			} else {
				adauga = true;
				break;
			}
		if (adauga == true)
			System.out.println("\nNu exista dispozitive medicale unice.");
		else {
			System.out.println("\nProdusele de tip dispozitive medicale unice sunt:");
			for (ProduseFarmacie a : unice) {
				System.out.println(a);
			}
		}

	}
}
