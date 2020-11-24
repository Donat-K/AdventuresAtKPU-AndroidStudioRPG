package ActionControllers;

import States.State;

public interface GameAction
{
	public abstract void executeAction(State currentState);
}
