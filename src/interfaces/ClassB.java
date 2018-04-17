package interfaces;

/**
 * @author victor olvera
 * Class that implements an interface that implements another interface
 */
public class ClassB implements AnotherInterfaceForB{

	@Override
	public boolean isQuadruped() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean canHuntWhileRunning() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double getMaxSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

}
