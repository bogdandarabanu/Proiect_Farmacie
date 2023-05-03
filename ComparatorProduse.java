package farmacie;

import java.util.Comparator;

public class ComparatorProduse implements Comparator<ProduseFarmacie> {

	@Override
	public int compare(ProduseFarmacie o1, ProduseFarmacie o2) {
		if(o1.getId().compareToIgnoreCase(o2.getId())>1)
			return 1;
		if(o1.getId().compareToIgnoreCase(o2.getId())<1)
			return -1;
		return 0;
	}


	}


