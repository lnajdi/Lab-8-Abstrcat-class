public class Camion  {
    private double capaciteReservoir;
    private double consommationCarburant;

    // Getters et Setters pour capaciteReservoir et consommationCarburant...

    


    // À FAIRE : Implémenter la méthode afficher
    // À FAIRE : Implémenter  la méthode calculerAutonomie et ajouter annotation convenable
    
    public double calculerAutonomie() {
        return (capaciteReservoir / consommationCarburant) * 100;
    }
}
