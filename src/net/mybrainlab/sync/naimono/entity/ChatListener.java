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
public class ChatListener implements EntityListener<Chat> {

    @Override
    public void preInsert(Chat entity, PreInsertContext<Chat> context) {
    }

    @Override
    public void preUpdate(Chat entity, PreUpdateContext<Chat> context) {
    }

    @Override
    public void preDelete(Chat entity, PreDeleteContext<Chat> context) {
    }

    @Override
    public void postInsert(Chat entity, PostInsertContext<Chat> context) {
    }

    @Override
    public void postUpdate(Chat entity, PostUpdateContext<Chat> context) {
    }

    @Override
    public void postDelete(Chat entity, PostDeleteContext<Chat> context) {
    }
}