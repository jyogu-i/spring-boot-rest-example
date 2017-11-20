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
public class TimesListener implements EntityListener<Times> {

    @Override
    public void preInsert(Times entity, PreInsertContext<Times> context) {
    }

    @Override
    public void preUpdate(Times entity, PreUpdateContext<Times> context) {
    }

    @Override
    public void preDelete(Times entity, PreDeleteContext<Times> context) {
    }

    @Override
    public void postInsert(Times entity, PostInsertContext<Times> context) {
    }

    @Override
    public void postUpdate(Times entity, PostUpdateContext<Times> context) {
    }

    @Override
    public void postDelete(Times entity, PostDeleteContext<Times> context) {
    }
}