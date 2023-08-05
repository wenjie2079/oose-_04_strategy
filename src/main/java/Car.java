public class Car extends Vehicle{
	protected double speed = 70;
	public Car(TravelBehaviour travel, MaintenanceBehaviour maintain) {

		super(travel,maintain);
		setVehicleSpeed(this.speed);

	}
	
	public void takeDamage()
	{
		this.maintainBehaviour = new HardMaintenance();
	}
}
