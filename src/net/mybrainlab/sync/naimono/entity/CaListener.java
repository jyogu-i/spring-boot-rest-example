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
public class CaListener implements EntityListener<Ca> {

    @Override
    public void preInsert(Ca entity, PreInsertContext<Ca> context) {
    }

    @Override
    public void preUpdate(Ca entity, PreUpdateContext<Ca> context) {
    }

    @Override
    public void preDelete(Ca entity, PreDeleteContext<Ca> context) {
    }

    @Override
    public void postInsert(Ca entity, PostInsertContext<Ca> context) {
    }

    @Override
    public void postUpdate(Ca entity, PostUpdateContext<Ca> context) {
    }

    @Override
    public void postDelete(Ca entity, PostDeleteContext<Ca> context) {
    }
}