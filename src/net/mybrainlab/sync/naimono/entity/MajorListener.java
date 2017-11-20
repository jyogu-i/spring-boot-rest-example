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
public class MajorListener implements EntityListener<Major> {

    @Override
    public void preInsert(Major entity, PreInsertContext<Major> context) {
    }

    @Override
    public void preUpdate(Major entity, PreUpdateContext<Major> context) {
    }

    @Override
    public void preDelete(Major entity, PreDeleteContext<Major> context) {
    }

    @Override
    public void postInsert(Major entity, PostInsertContext<Major> context) {
    }

    @Override
    public void postUpdate(Major entity, PostUpdateContext<Major> context) {
    }

    @Override
    public void postDelete(Major entity, PostDeleteContext<Major> context) {
    }
}