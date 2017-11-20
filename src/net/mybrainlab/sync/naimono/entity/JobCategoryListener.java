package net.mybrainlab.sync.naimono.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class JobCategoryListener implements EntityListener<JobCategory> {

    @Override
    public void preInsert(JobCategory entity, PreInsertContext<JobCategory> context) {
    }

    @Override
    public void preUpdate(JobCategory entity, PreUpdateContext<JobCategory> context) {
    }

    @Override
    public void preDelete(JobCategory entity, PreDeleteContext<JobCategory> context) {
    }

    @Override
    public void postInsert(JobCategory entity, PostInsertContext<JobCategory> context) {
    }

    @Override
    public void postUpdate(JobCategory entity, PostUpdateContext<JobCategory> context) {
    }

    @Override
    public void postDelete(JobCategory entity, PostDeleteContext<JobCategory> context) {
    }
}