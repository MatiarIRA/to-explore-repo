package com.matiar.api.explore.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.matiar.api.explore.model.Shipwreck;
import com.matiar.api.explore.repository.ShipwreckRepository;

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
	@Autowired
	private ShipwreckRepository shipwreckRepository;
	
	//we removed all the Shipwreck stub and replace it with the ShipwreckRepsitory
	
	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		return shipwreckRepository.findAll(); //ShipwreckStub.list();
	}
	
	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck shipwreck) {
		return shipwreckRepository.saveAndFlush(shipwreck); //ShipwreckStub.create(shipwreck);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		return shipwreckRepository.findOne(id); //ShipwreckStub.get(id);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
		Shipwreck existingShipwreck = shipwreckRepository.findOne(id);
		BeanUtils.copyProperties(shipwreck, existingShipwreck);
		return shipwreckRepository.saveAndFlush(existingShipwreck); //ShipwreckStub.update(id, shipwreck);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id) {
		Shipwreck shipwreck = shipwreckRepository.findOne(id);
		shipwreckRepository.delete(shipwreck); //ShipwreckStub.delete(id);
		return shipwreck;
	}
	
	/*
	 * OR
	 * @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable Long id) {
		shipwreckRepository.delete(id);
	}
	 */
}
