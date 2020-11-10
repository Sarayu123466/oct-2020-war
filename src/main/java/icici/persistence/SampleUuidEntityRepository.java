package icici.persistence;

import icici.domain.SampleUuidEntity;

import com.mongodb.Mongo;
import com.strategicgains.repoexpress.mongodb.MongodbUuidEntityRepository;

public class SampleUuidEntityRepository
extends MongodbUuidEntityRepository<SampleUuidEntity>
{
	@SuppressWarnings("unchecked")
    public SampleUuidEntityRepository(Mongo mongo, String dbName)
	{
		super(mongo, dbName, SampleUuidEntity.class);
	}
}
