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
public class ContactListener implements EntityListener<Contact> {

    @Override
    public void preInsert(Contact entity, PreInsertContext<Contact> context) {
    }

    @Override
    public void preUpdate(Contact entity, PreUpdateContext<Contact> context) {
    }

    @Override
    public void preDelete(Contact entity, PreDeleteContext<Contact> context) {
    }

    @Override
    public void postInsert(Contact entity, PostInsertContext<Contact> context) {
    }

    @Override
    public void postUpdate(Contact entity, PostUpdateContext<Contact> context) {
    }

    @Override
    public void postDelete(Contact entity, PostDeleteContext<Contact> context) {
    }
}