public abstract class Vehicle {
	
	protected TravelBehaviour travelBehaviour;
	protected MaintenanceBehaviour maintainBehaviour;
	private double maintenanceBill;
	private double distanceSinceLastService;
	protected double maxSpeed;

	protected double CHANGE_DISTANCESINCEASTSERVICE_TO_ZERO = 0;
	
	public Vehicle(TravelBehaviour travel, MaintenanceBehaviour maintain)
	{
		this.travelBehaviour = travel;
		this.maintainBehaviour = maintain;

	}
	
	public double travel(double timeTravelled) {

		return this.travelBehaviour.travel(timeTravelled, this);

	}

	public void maintain()
	{
		this.maintainBehaviour.maintainVehicle(this);

	}

	
	public double getVehicleSpeed() {
		return maxSpeed;
	}

	public void setVehicleSpeed(double speed) {
		this.maxSpeed = speed;
	}

	public TravelBehaviour getTravel() {
		return travelBehaviour;
	}

	public void setTravel(TravelBehaviour travel) {
		this.travelBehaviour = travel;
	}

	public MaintenanceBehaviour getMaintain() {
		return maintainBehaviour;
	}

	public void setMaintain(MaintenanceBehaviour maintain) {
		this.maintainBehaviour = maintain;
	}

	public double getMaintenanceBill() {
		return maintenanceBill;
	}

	public void setMaintenaceBill(double maintenaceBill) {
		this.maintenanceBill = maintenaceBill;
	}



	public double getDistanceSinceLastService() {
		return distanceSinceLastService;
	}

	public void setDistanceSinceLastService(double distanceSinceLastService) {

		this.distanceSinceLastService = distanceSinceLastService;
	}

	public static  void  main(String[] args){
		Vehicle vehicle = new Car(new FastTravel(), new HardMaintenance());
	}

}
