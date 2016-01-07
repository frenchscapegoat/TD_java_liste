package abstractTD;
class Personnel {
	private Employe[] staff;
	private int nbreEmploye;
	private final static int MAXEMPLOYE = 200;
	public Personnel() {
		staff = new Employe[MAXEMPLOYE];
		nbreEmploye = 0;    
	}

	public void ajouterEmploye(Employe e) {
		if (nbreEmploye <= MAXEMPLOYE) {
			++nbreEmploye;
			staff[nbreEmploye - 1] = e;
		} else {
			System.out.println("Pas plus de " + MAXEMPLOYE + " employés");
		}
	}

	public double salaireMoyen() {
		double somme = 0.0;
		for (int i = 0; i < nbreEmploye; i++) {
			somme += staff[i].calculerSalaire();
		}
		return somme / nbreEmploye;
	}
	public void afficherSalaires() {
		for (int i = 0; i < nbreEmploye; i++) {
			System.out.println(staff[i].getNom() + " gagne "+ staff[i].calculerSalaire() + " francs.");
		}
	}
}