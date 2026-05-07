package com.infy.roger.entity;


import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class FidoItem {
	
	public String localId;
	
	public String getLocalId() {
		return localId;
	}

	public void setLocalId(String id) {
		this.localId = id;
	}

	public FidoItem() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long serverId;
	
	public Long getServerId() {
		return serverId;
	}

	public void setServerId(Long serverId) {
		this.serverId = serverId;
	}

	public FidoItem(String localId,String name, Boolean favorite, String itemDescription, String imageUrl, Boolean syncStatus) {
		super();
		this.localId = localId;
		this.name = name;
		this.favorite = favorite;
		this.itemDescription = itemDescription;
		this.imageUrl = imageUrl;
		this.syncStatus = syncStatus;
	}

	public String name;
	
	public Boolean isSyncStatus() {
		return syncStatus;
	}

	public void setSyncStatus(Boolean syncStatus) {
		this.syncStatus = syncStatus;
	}
	
	@JsonProperty("syncStatus")
	public Boolean syncStatus;
	
	@JsonProperty("favorite")
	public Boolean favorite;
	   
    public String itemDescription;
    
    public String imageUrl;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(Boolean isFavorite) {
		this.favorite = isFavorite;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}
