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
public class IndustryListener implements EntityListener<Industry> {

    @Override
    public void preInsert(Industry entity, PreInsertContext<Industry> context) {
    }

    @Override
    public void preUpdate(Industry entity, PreUpdateContext<Industry> context) {
    }

    @Override
    public void preDelete(Industry entity, PreDeleteContext<Industry> context) {
    }

    @Override
    public void postInsert(Industry entity, PostInsertContext<Industry> context) {
    }

    @Override
    public void postUpdate(Industry entity, PostUpdateContext<Industry> context) {
    }

    @Override
    public void postDelete(Industry entity, PostDeleteContext<Industry> context) {
    }
}