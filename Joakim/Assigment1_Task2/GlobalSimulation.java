public class GlobalSimulation{
	
	// This class contains the definition of the events that shall take place in the
	// simulation. It also contains the global time, the event list and also a method
	// for insertion of events in the event list. That is just for making the code in
	// MainSimulation.java and State.java simpler (no dot notation is needed).
	
	public static final int ARRIVAL = 1, DEPARTURE_A = 2, ARRIVAL_B = 3, DEPARTURE_B = 4, MEASURE = 5; // The events, add or remove if needed!
	public static double time = 0; // The global time variable
	public static EventListClass eventListA = new EventListClass();// The event list used in the program
	public static void insertEvent(int type, double TimeOfEvent){  // Just to be able to skip dot notation
		eventListA.InsertEvent(type, TimeOfEvent);
	}
}