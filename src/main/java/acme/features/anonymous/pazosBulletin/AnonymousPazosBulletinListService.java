
package acme.features.anonymous.pazosBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.bulletin.Pazosbulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousPazosBulletinListService implements AbstractListService<Anonymous, Pazosbulletin> {

	@Autowired
	AnonymousPazosBulletinRepository repository;


	@Override
	public boolean authorise(final Request<Pazosbulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Pazosbulletin> request, final Pazosbulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "text", "moment", "foodHandler", "experience", "contact");

	}

	@Override
	public Collection<Pazosbulletin> findMany(final Request<Pazosbulletin> request) {
		assert request != null;

		Collection<Pazosbulletin> result;

		result = this.repository.findMany();

		return result;
	}

}
