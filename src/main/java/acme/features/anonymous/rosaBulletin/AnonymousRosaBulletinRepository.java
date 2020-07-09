
package acme.features.anonymous.rosaBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.bulletin.Rosabulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRosaBulletinRepository extends AbstractRepository {

	@Query("select r from Rosabulletin r")
	Collection<Rosabulletin> findMany();

}
