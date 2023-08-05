public class HomeMaintenance implements MaintenanceBehaviour{
    public static double HOME_MAINTENANCE_MUTIPLIER=0;
    public void maintainVehicle(Vehicle vehicle) {

        vehicle.setMaintenaceBill(vehicle.getDistanceSinceLastService() * HOME_MAINTENANCE_MUTIPLIER);
        vehicle.setDistanceSinceLastService(vehicle.CHANGE_DISTANCESINCEASTSERVICE_TO_ZERO);

    }
}
