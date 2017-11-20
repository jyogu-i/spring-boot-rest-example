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
public class RequestListener implements EntityListener<Request> {

    @Override
    public void preInsert(Request entity, PreInsertContext<Request> context) {
    }

    @Override
    public void preUpdate(Request entity, PreUpdateContext<Request> context) {
    }

    @Override
    public void preDelete(Request entity, PreDeleteContext<Request> context) {
    }

    @Override
    public void postInsert(Request entity, PostInsertContext<Request> context) {
    }

    @Override
    public void postUpdate(Request entity, PostUpdateContext<Request> context) {
    }

    @Override
    public void postDelete(Request entity, PostDeleteContext<Request> context) {
    }
}