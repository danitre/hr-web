package it.objectway.hr.presentation.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public abstract class BaseAction extends Action {
	
	public final Logger log = Logger.getLogger(getClass());
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		ActionForward doIt = null;
		log.info(getClass() + " --> Execute");
		try {
			doIt = doIt(mapping, form, request, response);
		} catch (Exception e){
			log.error(e.getMessage(), e);
			ActionErrors errors = new ActionErrors();
			errors.add(ActionErrors.GLOBAL_MESSAGE, new ActionMessage("errors.imprevisto", e.getMessage()));
			//request.setAttribute("errors", errors);
			saveErrors(request, errors);
		}
		if ( doIt == null )
			doIt = mapping.findForward("ko");
		return doIt;
	}
	
	public abstract ActionForward doIt(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
			throws Exception;
	
}