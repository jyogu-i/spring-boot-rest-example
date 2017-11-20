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
public class WorkListener implements EntityListener<Work> {

    @Override
    public void preInsert(Work entity, PreInsertContext<Work> context) {
    }

    @Override
    public void preUpdate(Work entity, PreUpdateContext<Work> context) {
    }

    @Override
    public void preDelete(Work entity, PreDeleteContext<Work> context) {
    }

    @Override
    public void postInsert(Work entity, PostInsertContext<Work> context) {
    }

    @Override
    public void postUpdate(Work entity, PostUpdateContext<Work> context) {
    }

    @Override
    public void postDelete(Work entity, PostDeleteContext<Work> context) {
    }
}