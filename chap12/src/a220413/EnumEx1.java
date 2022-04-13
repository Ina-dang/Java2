package a220413;

enum Direction {
	EAST, SOUTH, WEST, NORTH
	}

public class EnumEx1 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		System.out.println("=======================");
		System.out.println(d1 == d2);
		System.out.println(d3 == d2);
		System.out.println("d1.equals(d3) : " + d1.equals(d3));
		System.out.println("d1.compareTo(d3) : " + d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) : " + d1.compareTo(d2));

		System.out.println("=======================");
		switch(d1) {
		case EAST : 
			System.out.println("direction is EAST");
			break;
		case SOUTH : 
			System.out.println("direction is SOUTH");
			break;
		case WEST : 
			System.out.println("direction is WEST");
			break;
		case NORTH : 
			System.out.println("direction is NORTH");
			break;
		default:
			break;
		}
		
		Direction[] dArr = Direction.values();
		
		for(Direction d : dArr)
			System.out.printf("%s=%d%n", d.name(), d.ordinal());
	}
}
