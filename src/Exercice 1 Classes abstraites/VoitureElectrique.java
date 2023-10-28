public class VoitureElectrique extends Vehicule {
    private  distanceMaximale;
    private  energieElectrique;

    // Getters et Setters pour distanceMaximale et energieElectrique...

   
    
    // À FAIRE : Implémenter la méthode afficher
    // À FAIRE : Déclarer les attributs pour la méthode calculerAutonomie et l'implémenter
    @Override
    public double calculerAutonomie() {
        return (distanceMaximale / energieElectrique) * 100;
    }
}
