
package acme.features.anonymous.pazosBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletin.Pazosbulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousPazosBulletinRepository extends AbstractRepository {

	@Query("select p from Pazosbulletin p")
	Collection<Pazosbulletin> findMany();

}
