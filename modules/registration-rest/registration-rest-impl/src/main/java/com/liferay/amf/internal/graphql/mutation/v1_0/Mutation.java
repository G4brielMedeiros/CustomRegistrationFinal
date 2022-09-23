package com.liferay.amf.internal.graphql.mutation.v1_0;

import com.liferay.amf.dto.v1_0.AccountInfo;
import com.liferay.amf.resource.v1_0.AccountInfoResource;
import com.liferay.petra.function.UnsafeConsumer;
import com.liferay.petra.function.UnsafeFunction;
import com.liferay.portal.kernel.search.Sort;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.RoleLocalService;
import com.liferay.portal.vulcan.accept.language.AcceptLanguage;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;

import java.util.function.BiFunction;

import javax.annotation.Generated;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.osgi.service.component.ComponentServiceObjects;

/**
 * @author gabriel
 * @generated
 */
@Generated("")
public class Mutation {

	public static void setAccountInfoResourceComponentServiceObjects(
		ComponentServiceObjects<AccountInfoResource>
			accountInfoResourceComponentServiceObjects) {

		_accountInfoResourceComponentServiceObjects =
			accountInfoResourceComponentServiceObjects;
	}

	@GraphQLField(description = "Creates a new account")
	public Response createRegistration(
			@GraphQLName("accountInfo") AccountInfo accountInfo)
		throws Exception {

		return _applyComponentServiceObjects(
			_accountInfoResourceComponentServiceObjects,
			this::_populateResourceContext,
			accountInfoResource -> accountInfoResource.postRegistration(
				accountInfo));
	}

	private <T, R, E1 extends Throwable, E2 extends Throwable> R
			_applyComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeFunction<T, R, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			return unsafeFunction.apply(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private <T, E1 extends Throwable, E2 extends Throwable> void
			_applyVoidComponentServiceObjects(
				ComponentServiceObjects<T> componentServiceObjects,
				UnsafeConsumer<T, E1> unsafeConsumer,
				UnsafeConsumer<T, E2> unsafeFunction)
		throws E1, E2 {

		T resource = componentServiceObjects.getService();

		try {
			unsafeConsumer.accept(resource);

			unsafeFunction.accept(resource);
		}
		finally {
			componentServiceObjects.ungetService(resource);
		}
	}

	private void _populateResourceContext(
			AccountInfoResource accountInfoResource)
		throws Exception {

		accountInfoResource.setContextAcceptLanguage(_acceptLanguage);
		accountInfoResource.setContextCompany(_company);
		accountInfoResource.setContextHttpServletRequest(_httpServletRequest);
		accountInfoResource.setContextHttpServletResponse(_httpServletResponse);
		accountInfoResource.setContextUriInfo(_uriInfo);
		accountInfoResource.setContextUser(_user);
		accountInfoResource.setGroupLocalService(_groupLocalService);
		accountInfoResource.setRoleLocalService(_roleLocalService);
	}

	private static ComponentServiceObjects<AccountInfoResource>
		_accountInfoResourceComponentServiceObjects;

	private AcceptLanguage _acceptLanguage;
	private com.liferay.portal.kernel.model.Company _company;
	private GroupLocalService _groupLocalService;
	private HttpServletRequest _httpServletRequest;
	private HttpServletResponse _httpServletResponse;
	private RoleLocalService _roleLocalService;
	private BiFunction<Object, String, Sort[]> _sortsBiFunction;
	private UriInfo _uriInfo;
	private com.liferay.portal.kernel.model.User _user;

}