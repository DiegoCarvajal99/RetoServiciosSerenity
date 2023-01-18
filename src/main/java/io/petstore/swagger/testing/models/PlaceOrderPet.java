package io.petstore.swagger.testing.models;

public class PlaceOrderPet {
	
	String id, petId, quantity, shipDate, status;
	Boolean complete;

	public PlaceOrderPet(String id, String petId, String quantity, String shipDate, String status) {
		super();
		this.id = id;
		this.petId = petId;
		this.quantity = quantity;
		this.shipDate = shipDate;
		this.status = status;
	}
	
	public PlaceOrderPet(Boolean complete) {
		super();
		this.complete = complete;
	}
	
	public Boolean getComplete() {
		return complete;
	}

	public String getId() {
		return id;
	}

	public String getPetId() {
		return petId;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getShipDate() {
		return shipDate;
	}

	public String getStatus() {
		return status;
	}

	
}
