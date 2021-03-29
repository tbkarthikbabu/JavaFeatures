package dev.java.design.pattern.creational.builder;

public class BuilderDP {

	public static void main(String[] args) {

		HouseBuilder igloo = new IglooBuilder();
		CivilEngineer engg = new CivilEngineer(igloo);
		engg.constructHouse();
		System.out.println("Build Const: " + engg.getHouse());
	}

}

interface HousePlan {

	public void setBasement(String basement);

	public void setStructure(String structure);

	public void setRoof(String roof);

	public void setInterior(String interior);
}

class House implements HousePlan {

	private String basement;
	private String structure;
	private String roof;
	private String interior;

	@Override
	public void setBasement(String basement) {
		this.basement = basement;
	}

	@Override
	public void setStructure(String structure) {
		this.structure = structure;
	}

	@Override
	public void setRoof(String roof) {
		this.roof = roof;
	}

	@Override
	public void setInterior(String interior) {
		this.interior = interior;
	}

}

interface HouseBuilder {

	public void buildBasement();

	public void buildStructure();

	public void buildRoof();

	public void buildInterior();

	public House getHouse();

}

class IglooBuilder implements HouseBuilder {

	private House house;

	public IglooBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		house.setBasement("Ice Bars");
	}

	@Override
	public void buildStructure() {
		house.setStructure("Ice Blocks");
	}

	@Override
	public void buildRoof() {
		house.setRoof("Ice Dome");
	}

	@Override
	public void buildInterior() {
		house.setInterior("Ice Carving");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}

class CivilEngineer {
	private HouseBuilder housebuilder;

	public CivilEngineer(HouseBuilder housebuilder) {
		this.housebuilder = housebuilder;
	}

	public House getHouse() {
		return this.housebuilder.getHouse();
	}

	public void constructHouse() {
		this.housebuilder.buildBasement();
		this.housebuilder.buildStructure();
		this.housebuilder.buildRoof();
		this.housebuilder.buildInterior();
	}
}