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
public class EnglishListener implements EntityListener<English> {

    @Override
    public void preInsert(English entity, PreInsertContext<English> context) {
    }

    @Override
    public void preUpdate(English entity, PreUpdateContext<English> context) {
    }

    @Override
    public void preDelete(English entity, PreDeleteContext<English> context) {
    }

    @Override
    public void postInsert(English entity, PostInsertContext<English> context) {
    }

    @Override
    public void postUpdate(English entity, PostUpdateContext<English> context) {
    }

    @Override
    public void postDelete(English entity, PostDeleteContext<English> context) {
    }
}