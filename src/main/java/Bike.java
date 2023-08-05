public class Bike extends Vehicle{
	protected double speed = 15;

	public Bike(TravelBehaviour travel, MaintenanceBehaviour maintain) {

		super(travel, maintain);
		setVehicleSpeed(this.speed);

	}


	public void learnHomeMaintenance()
	{
		this.maintainBehaviour = new HomeMaintenance();
	}

}
