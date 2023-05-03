package farmacie;

public class ProduseFarmacie {
	private String id;
	private String tipMedicament;
	private String nume;
	private String descriere;
	private String producator;
	private String valabilitate;

	public ProduseFarmacie(String id, String tipMedicament, String nume, String descriere, String producator,
			String valabilitate) {
		super();
		this.id = id;
		this.tipMedicament = tipMedicament;
		this.nume = nume;
		this.descriere = descriere;
		this.producator = producator;
		this.valabilitate = valabilitate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTipMedicament() {
		return tipMedicament;
	}

	public void setTipMedicament(String tipMedicament) {
		this.tipMedicament = tipMedicament;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public String getProducator() {
		return producator;
	}

	public void setProducator(String producator) {
		this.producator = producator;
	}

	public String getValabilitate() {
		return valabilitate;
	}

	public void setValabilitate(String valabilitate) {
		this.valabilitate = valabilitate;
	}

	public void afisare() {
		System.out.println(
				id + "-" + tipMedicament + "-" + nume + "-" + descriere + "-" + producator + "-" + valabilitate);
	}

	@Override
	public String toString() {
		return id + "-" + tipMedicament + "-" + nume + "-" + descriere + "-" + producator + "-" + valabilitate;
	}

}