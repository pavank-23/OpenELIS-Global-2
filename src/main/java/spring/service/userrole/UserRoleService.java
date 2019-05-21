package spring.service.userrole;

import java.util.Collection;
import java.util.List;

import spring.service.common.BaseObjectService;
import us.mn.state.health.lims.userrole.valueholder.UserRole;

public interface UserRoleService extends BaseObjectService<UserRole> {

	List<String> getRoleIdsForUser(String string);

	boolean userInRole(String sysUserId, Collection<String> ableToCancelRoleNames);
}