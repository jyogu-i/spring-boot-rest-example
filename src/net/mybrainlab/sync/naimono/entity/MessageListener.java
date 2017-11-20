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
public class MessageListener implements EntityListener<Message> {

    @Override
    public void preInsert(Message entity, PreInsertContext<Message> context) {
    }

    @Override
    public void preUpdate(Message entity, PreUpdateContext<Message> context) {
    }

    @Override
    public void preDelete(Message entity, PreDeleteContext<Message> context) {
    }

    @Override
    public void postInsert(Message entity, PostInsertContext<Message> context) {
    }

    @Override
    public void postUpdate(Message entity, PostUpdateContext<Message> context) {
    }

    @Override
    public void postDelete(Message entity, PostDeleteContext<Message> context) {
    }
}