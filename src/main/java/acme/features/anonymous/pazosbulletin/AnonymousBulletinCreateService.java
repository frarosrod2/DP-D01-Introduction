
package acme.features.anonymous.pazosbulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.pazosbulletin.Pazosbulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousBulletinCreateService implements AbstractCreateService<Anonymous, Pazosbulletin> {

	@Autowired
	AnonymousBulletinRepository repository;


	@Override
	public boolean authorise(final Request<Pazosbulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Pazosbulletin> request, final Pazosbulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Pazosbulletin> request, final Pazosbulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "text", "foodHandler", "experience", "contact");
	}

	@Override
	public Pazosbulletin instantiate(final Request<Pazosbulletin> request) {
		assert request != null;

		Pazosbulletin result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		result = new Pazosbulletin();
		result.setAuthor("Jim H");
		result.setText("FH no exp");
		result.setMoment(moment);
		result.setFoodHandler(true);
		result.setExperience(false);
		result.setContact("jim@email.com");

		return result;
	}

	@Override
	public void validate(final Request<Pazosbulletin> request, final Pazosbulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Pazosbulletin> request, final Pazosbulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);
		this.repository.save(entity);

	}
}
