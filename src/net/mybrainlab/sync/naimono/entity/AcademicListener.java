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
public class AcademicListener implements EntityListener<Academic> {

    @Override
    public void preInsert(Academic entity, PreInsertContext<Academic> context) {
    }

    @Override
    public void preUpdate(Academic entity, PreUpdateContext<Academic> context) {
    }

    @Override
    public void preDelete(Academic entity, PreDeleteContext<Academic> context) {
    }

    @Override
    public void postInsert(Academic entity, PostInsertContext<Academic> context) {
    }

    @Override
    public void postUpdate(Academic entity, PostUpdateContext<Academic> context) {
    }

    @Override
    public void postDelete(Academic entity, PostDeleteContext<Academic> context) {
    }
}