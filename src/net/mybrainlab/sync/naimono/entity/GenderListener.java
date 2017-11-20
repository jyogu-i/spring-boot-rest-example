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
public class GenderListener implements EntityListener<Gender> {

    @Override
    public void preInsert(Gender entity, PreInsertContext<Gender> context) {
    }

    @Override
    public void preUpdate(Gender entity, PreUpdateContext<Gender> context) {
    }

    @Override
    public void preDelete(Gender entity, PreDeleteContext<Gender> context) {
    }

    @Override
    public void postInsert(Gender entity, PostInsertContext<Gender> context) {
    }

    @Override
    public void postUpdate(Gender entity, PostUpdateContext<Gender> context) {
    }

    @Override
    public void postDelete(Gender entity, PostDeleteContext<Gender> context) {
    }
}