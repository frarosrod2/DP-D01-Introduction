
package acme.features.anonymous.pazosbulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.pazosbulletin.Pazosbulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousBulletinRepository extends AbstractRepository {

	@Query("select p from Pazosbulletin p")
	Collection<Pazosbulletin> findMany();

}
